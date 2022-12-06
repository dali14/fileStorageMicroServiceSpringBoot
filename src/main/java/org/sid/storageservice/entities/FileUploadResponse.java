package org.sid.storageservice.entities;




public class FileUploadResponse {

    private String fileName;
    private String downloadUri;
    private long size;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setDownloadUri(String downloadUri) {
        this.downloadUri = downloadUri;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getDownloadUri() {
        return downloadUri;
    }

    public long getSize() {
        return size;
    }

    public String getFileName() {
        return fileName;
    }
}
