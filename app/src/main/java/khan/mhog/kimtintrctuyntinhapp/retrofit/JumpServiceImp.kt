package khan.mhog.kimtintrctuyntinhapp.retrofit

import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow

class JumpServiceImp {

    private val service: JumpService = RetrofitHelper.service()

    suspend fun getJumpCodeUrl(param: RequestModel): Flow<ResponseModel> = callbackFlow {
        trySend(service.getJumpCode(param))
        awaitClose()
    }

}