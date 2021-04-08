package uk.co.origamibits.bootstrap.feature1.model

import java.io.Serializable
import java.util.*

data class Feature1Item(
    val id: String = UUID.randomUUID().toString(),
    val value: String
) : Serializable
