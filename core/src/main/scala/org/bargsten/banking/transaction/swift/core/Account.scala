package org.bargsten.banking.transaction.swift.core

opaque type EuroCents = Long
object EuroCents {
  def apply(value: Long): EuroCents = value

  extension (value: EuroCents) {
    def unwrap: Long = value
  }
}

case class Account(
    id: String,
    name: String,
    balance: EuroCents,
)
