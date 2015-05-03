package linksharing

class DocumentResource {
    String filePath
    static belongsTo = [resource:Resource]
    static constraints = {
    }
}
