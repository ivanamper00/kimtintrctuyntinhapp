package khan.mhog.kimtintrctuyntinhapp.retrofit

import retrofit2.http.Body
import retrofit2.http.POST

interface JumpService {

    @POST("app_conf")
    suspend fun getJumpCode(@Body param: RequestModel): ResponseModel

}