package org.bargsten.banking.transaction.swift.api

import org.bargsten.banking.transaction.swift.api.dto.Account
import org.bargsten.banking.transaction.swift.core.AccountService

class SwiftRoutes(accountService: AccountService) {
  // use what your favourite framework, e.g. Tapir, to define endpoints/routes
  def getAccount(accountId: String): Account = ???
}
