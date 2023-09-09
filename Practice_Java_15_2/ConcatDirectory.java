public String concatDirectory(String folder, String file){
    if(!folder.endsWith("\\")){
        folder += "\\";
    }
    return folder + file;
}
