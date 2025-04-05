package org.bargsten.banking.transaction.swift.api.dto

import org.bargsten.banking.transaction.swift.core

// Don't name it AccountDto. You are already in the dto package AND
// having the suffix "Dto" in your (REST) API looks somewhat unprofessional.
case class Account(
    id: String,
    name: String,
    balance: BigDecimal,
)

object Account {
  def fromDomain(account: core.Account): Account = {
    Account(
      id = account.id,
      name = account.name,
      balance = BigDecimal(account.balance.unwrap)/100,
    )
  }
}
