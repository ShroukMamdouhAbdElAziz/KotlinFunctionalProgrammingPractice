package com.example.kotlinrevesion

interface DownloadListener {
    fun onDownloadStarted()
    fun onDownloadCompleted(file:String)
    fun OnProgressUpdate(progress:Int)

}