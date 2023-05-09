package com.tswanarecipe.app.firestore.models

import com.google.firebase.firestore.PropertyName
import kotlin.Any
import kotlin.String
import kotlin.jvm.JvmField

public class User {
  @JvmField
  @PropertyName("User-name")
  public var username: String? = null

  @JvmField
  @PropertyName("Email")
  public var email: String? = null

  @JvmField
  @PropertyName("Password")
  public var password: String? = null

  @JvmField
  @PropertyName("Profile-Photo")
  public var profilePhoto: Any? = null
}
