package araya.gonzalo.detodo.model.network

import araya.gonzalo.detodo.model.EmpresaResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    // Listado de empresas trae un array
    @GET("empresas")
    fun obtenerEmpresas(): Call<List<EmpresaResponse>>

    // Detalle de empresa, trae un objeto {}
    @GET("empresas/{id_empresa}")
    fun detalleEmpresa(@Path("id_empresa") EmpresaCargar: Int): Call<EmpresaResponse>

}