package com.example.kotlinrevesion




fun main() {

    var downloader = Downloader()
    downloader.downloadListener = object : DownloadListener {

        override fun onDownloadStarted() {
            println("Download Started")
        }

        override fun onDownloadCompleted(file: String) {
            println("$file Downloaded")
        }

        override fun OnProgressUpdate(progress: Int) {
            println("$progress% Downloaded")
        }


    }
    downloader.downloadFile("file")


}