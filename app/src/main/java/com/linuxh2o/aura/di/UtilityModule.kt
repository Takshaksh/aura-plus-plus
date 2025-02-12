package com.linuxh2o.aura.di

import android.app.Application
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.work.WorkManager
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.linuxh2o.aura.utilities.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.ConnectionSpec
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit


@InstallIn(SingletonComponent::class)
@Module
object UtilityModule {
    private val Context.appDataStore by preferencesDataStore(name = Constants.PREF_CONFIG)

    @Provides
    fun provideDataStore(@ApplicationContext context: Context) : DataStore<Preferences> {
        return context.appDataStore
    }


    @Provides
    fun provideGson() : Gson {
        return GsonBuilder().create()
    }

    @Provides
    fun provideWorkManager(context: Application): WorkManager {
        return WorkManager.getInstance(context)
    }


    @Provides
    fun provideLoggingInterceptor() : HttpLoggingInterceptor {
        return HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @Provides
    fun provideOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
    ) : OkHttpClient {
        val protocolsToUse = listOf(Protocol.HTTP_1_1)

        val okHttpClient = OkHttpClient.Builder()
            .protocols(protocolsToUse)
            .connectTimeout(Constants.DEFAULT_API_TIMEOUT, TimeUnit.SECONDS)
            .addInterceptor(loggingInterceptor)

        //okHttpClient.connectionSpecs(listOf(ConnectionSpec.CLEARTEXT))

        okHttpClient.addInterceptor(loggingInterceptor)

        return okHttpClient.build()
    }
}