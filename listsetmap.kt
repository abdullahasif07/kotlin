
//Collections: list, set and map

data class Comment(
 val userId:Int,
 val message:String   
)


fun main()
{
    val comments: List<Comment> = listOf(Comment(5241,"nice code"),Comment(6624,"Like it"),Comment(5224,"whats going on")
                                  ,Comment(9001,"checkout my website"),Comment(8818,"hello everyne ;)"))
    var blockedUserIds: Set<Int> =setOf(5224,9001)
    
    var userIdToRelation: Map<Int,String> = mapOf(5241 to "friend", 6624 to "work colleague")
    
    for (comment in comments)
    {
        if (comment.userId !in blockedUserIds)
        {
            if (userIdToRelation.get(comment.userId)!=null)
            {
                println("comment: ${comment.message} from ${userIdToRelation[comment.userId]}")
            }
            else
            {
                println("comment: ${comment.message} from unknown")
            }
        }
    }
    	
}
