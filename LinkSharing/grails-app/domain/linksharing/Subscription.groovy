package linksharing

import groovy.Seriousness

class Subscription {

    Seriousness seriousness
    Date dateCreated
    static belongsTo = [topic:Topic,user:User]
    static constraints = {
    }
}
