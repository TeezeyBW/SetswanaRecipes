package com.tswanarecipe.app.firestore.models

import com.google.firebase.firestore.PropertyName
import kotlin.String
import kotlin.jvm.JvmField

public class SignIn {
  @JvmField
  @PropertyName("User-Name")
  public var userName: String? = null

  @JvmField
  @PropertyName("Password")
  public var password: String? = null
}
