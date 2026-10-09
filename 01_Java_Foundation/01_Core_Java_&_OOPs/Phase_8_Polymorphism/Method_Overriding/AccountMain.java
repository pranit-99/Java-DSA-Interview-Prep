/*Banking Account System — Covariant Return Type

So far, our overridden methods used exactly the same return type.

For example:

double calculateBonus(...)

in both parent and child.

But Java has an important overriding rule:

When returning objects, an overriding method can return a more specific type than the parent method.

This is called a covariant return type.

Problem Statement

Suppose a banking application creates different types of accounts.

We have:

BankAccount
    |
    └── SavingsAccount

And a service hierarchy:

AccountService
      |
      └── SavingsAccountService

The parent service has:

BankAccount createAccount()

The child overrides it with:

SavingsAccount createAccount()

Notice the return types are different.

But this is valid because:

SavingsAccount IS-A BankAccount */
class BankAccount {

    public void accountInfo() {

        System.out.println("General Bank Account");
    }
}


class SavingsAccount extends BankAccount {

    public void savingsInfo() {

        System.out.println("Savings Account Created");
    }
}


class AccountService {

    public BankAccount createAccount() {

        System.out.println("Creating General Bank Account");

        return new BankAccount();
    }
}


class SavingsAccountService extends AccountService {

    @Override
    public SavingsAccount createAccount() {

        System.out.println("Creating Savings Account");

        return new SavingsAccount();
    }
}


public class AccountMain {

    public static void main(String[] args) {

        AccountService service =
                new SavingsAccountService();

        BankAccount account =
                service.createAccount();

        account.accountInfo();
    }
}