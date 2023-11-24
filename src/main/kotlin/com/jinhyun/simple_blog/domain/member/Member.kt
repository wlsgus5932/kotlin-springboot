package com.jinhyun.simple_blog.domain.member

import jakarta.persistence.*

@Entity
@Table(name = "Member")
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long,

    @Column(name = "email")
    var email:String,

    @Column(name = "email")
    var password:String


)
{
}