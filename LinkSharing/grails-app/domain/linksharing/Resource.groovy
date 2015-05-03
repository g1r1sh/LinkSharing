package linksharing

class Resource {
    String description
    Date dateCreated
    Date dateUpdated
    static belongsTo = [createdBy:User,topic:Topic]
    static hasOne = [linkResource:LinkResource,documentResource:DocumentResource]
    static constraints = {
    }
}
