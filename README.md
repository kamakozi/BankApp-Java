# Java Bank Account Simulation Project

This is a simple Java-based Bank Account Simulation project designed to manage user bank accounts with basic functionalities like registration, login, deposit, withdrawal, and balance checking.

## **Features**
- **User Registration:** Create new bank accounts with personal details, auto-generated IBAN, and account status based on age.
- **Secure Login:** Authenticate users with username and password.
- **Banking Operations:** Perform deposits, withdrawals, and balance inquiries.
- **Account Management:** Display details of all registered accounts.

---

## **Project Structure**

```
com.example.demo
├── accounts
│   └── BankAccount.java
├── controller
│   ├── Register.java
│   ├── Login.java
│   └── MainMenu.java
└── Application.java
```

---

## **Installation and Setup**

1. Clone the repository:
   ```bash
   git clone https://github.com/kamakozi/BankApp-Java.git
   ```
2. Open the project in your preferred IDE (such as IntelliJ IDEA, Eclipse, or Xcode).
3. Build and run the project.

---

## **Usage Instructions**

- **Register a New Account:** Follow the prompts to create an account with necessary details.
- **Login to Your Account:** Provide your username and password to access your account.
- **Perform Transactions:** Choose to deposit, withdraw, or check balance after logging in.

---

## **Technologies Used**
- Java (JDK 17+)
- Spring Boot (for project structure)
- Lombok (for boilerplate code reduction)

---

## **Known Issues**
- Basic password handling without encryption.

---

## **Upcoming Features**
- **Security Updates:** Implement password hashing and data encryption.
- **Transaction Logs:** Maintain a history of all user transactions.
- **Enhanced UI:** Develop a graphical user interface using Java Swing.
- **Multi-threading:** Handle multiple user operations concurrently.
- **API Integration:** Connect to external banking APIs for real-time operations.




