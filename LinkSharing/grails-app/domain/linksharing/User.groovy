package linksharing

class User {
    String username
    String password
    String firstName
    String lastName
    String email
    String photo
    Boolean isAdmin
    Boolean isActive
    Date dateCreated
    Date dateUpdated
    static hasMany = [subscription:Subscription,topic:Topic,resource:Resource,readingItem:ReadingItem,resourceRating:ResourceRating]
    static constraints = {
        email(unique: true, blank: false)
        username( unique: true)
    }
}
