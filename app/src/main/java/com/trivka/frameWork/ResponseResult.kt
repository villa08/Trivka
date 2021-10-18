package com.trivka.frameWork

data class ResponseResult<out T>(val status: Status, val data: T?, val error: Error?, val message: String?) {

    enum class Status {
        SUCCESS,
        ERROR,
        LOADING
    }

    companion object {
        fun <T> success(data: T?): ResponseResult<T> {
            return ResponseResult(Status.SUCCESS, data, null, null)
        }

        fun <T> error(message: String, error: Error?): ResponseResult<T> {
            return ResponseResult(Status.ERROR, null, error, message)
        }

        fun <T> loading(data: T? = null): ResponseResult<T> {
            return ResponseResult(Status.LOADING, data, null, null)
        }
    }

    override fun toString(): String {
        return "Result(status=$status, data=$data, error=$error, message=$message)"
    }
}