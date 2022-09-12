package com.example.kotlinrevesion

class Downloader {

    var
            downloadListener: DownloadListener? = null

    fun downloadFile(file: String) {

        downloadListener?.onDownloadStarted()

        for (i in 1..10) {
            Thread.sleep(600)
            downloadListener?.OnProgressUpdate(1*10
            )
        }

    }
}