package io.jerryc05.hello_ssr.network.ssrsub

open class SubUpdateCallback
{
	/**
	 * success
	 */
	open fun onSuccess(subName: String)
	{
	}

	/**
	 * failed
	 */
	open fun onFailed()
	{
	}

	/**
	 * finished
	 */
	open fun onFinished()
	{
	}
}
