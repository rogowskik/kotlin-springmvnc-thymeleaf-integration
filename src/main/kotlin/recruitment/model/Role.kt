package recruitment.model

import javax.persistence.*

/**
 * Created by Kamil on 9/22/2017.
 */


@Entity
open class Role(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = -1,

        @ManyToMany(mappedBy = "roles")
        var students: MutableList<User> = mutableListOf(),

        var role: String = "",

        var roleName: String = ""
)
