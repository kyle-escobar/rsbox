package io.rsbox.server.util

import io.rsbox.server.util.security.RSA
import org.koin.dsl.module

val UTIL_MODULE = module {
    single { RSA() }
}