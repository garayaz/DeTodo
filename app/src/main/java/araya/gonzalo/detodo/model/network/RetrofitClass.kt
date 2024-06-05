package araya.gonzalo.detodo.model.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Clase para generar la instancia de Retrofit
 */
class RetrofitClass {
    companion object{
        val retrofit = Retrofit.Builder()
            .baseUrl("https://retoolapi.dev/cluuwe/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}