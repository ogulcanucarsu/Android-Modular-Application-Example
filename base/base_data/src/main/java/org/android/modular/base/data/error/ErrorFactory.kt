package org.android.modular.base.data.error

interface ErrorFactory {

    fun createUnknownError(): Error

    fun createApiError(statusError: StatusError): Error

    fun createApiError(code: String, messages: String): Error

    fun createErrors(errors: List<StatusError>?): Error

    fun createErrorFromThrowable(t: Throwable): Error

    fun createInvalidResponseError(): Error

    fun createUnHandledStateError(): Error

    fun createInvalidInteractorRequestError(): Error

    fun createAuthenticationError(): Error

    fun emptyCacheResultError(): Error

    fun createConnectionError(): Error

    fun createBusinessError(code: Int = 1, message: String? = null): Error

}

