package linksharing

import groovy.Visibility

class Topic {
    String name
    Date dateCreated
    Date dateUpdated
    Visibility visibility
    static belongsTo = [createdBy:User]
    static hasMany = [subscription:Subscription,resource:Resource]
    static constraints = {
    }
}
