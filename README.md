````markdown
# BankAccount Java Project

> **Author:** Leonardo Almeida (submitted via friend’s GitHub account)  
> **Language:** Java  
> **Project Type:** Console Application  
> **Status:** imcompleted  

---

## 📌 Project Overview

This is my **first complete Java project**, a simple **Bank Account Management System**.  
The program allows a user to:

- Create a bank account with a unique account number
- Make an optional initial deposit
- Deposit money into the account
- Withdraw money from the account
- View account details at any time

It demonstrates the use of **object-oriented programming (OOP)** concepts, including:

- Classes and objects
- Constructors
- Encapsulation (private attributes with methods to access)
- Methods (`deposit`, `withdraw`, `toString`)
- Input handling with `Scanner`
- Conditional logic (`if-else`, `switch`)
- Loops (`for`, `while`)
- Random number generation for account numbers

---

## ⚙️ Features

1. **Account Creation**  
   - Ask the user for name and CPF  
   - Ask if there is an initial deposit  
   - Automatically generates a unique 6-digit account number  

2. **Deposit and Withdrawal**  
   - User can deposit or withdraw money at any time  
   - Balance updates correctly  
   - Prevents invalid operations (like withdrawing more than the balance)  

3. **Account Summary**  
   - Displays all relevant account information in a formatted way  
   - Uses `toString()` for clean output  

4. **Menu System**  
   - Interactive menu with options for deposit, withdrawal, viewing account, and exiting  
   - Uses `switch-case` for easy option handling  

---

## 📝 How to Run

1. Clone this repository:

```bash
git clone https://github.com/SeuUsuario/NomeDoRepo.git
````

2. Open the project in **Eclipse**, **IntelliJ**, or your preferred IDE.
3. Run the `Program.java` class.
4. Follow the console prompts to interact with your bank account:

---

## 📷 Example Output

```
=== Bank Menu ===
1 - Create new account
2 - Deposit money
3 - Withdraw money
4 - Show account data
5 - Exit
Choose an option: 1

Enter your name: Alex Green
Enter your CPF: 12345678901
Is there an initial deposit (y/n)? y
Enter initial deposit value: 500
Your account number is: 123456
Account successfully created!
Account data:
Owner: Alex Green
Account Number: 123456
Balance: $500.00
```

---

## 💡 Notes

* Random numbers are used to generate account numbers.
* The program currently runs in the console and does **not persist accounts after closing**.
* Designed for educational purposes to practice Java OOP concepts.

---

## 🛠 Future Improvements

* Add data persistence (saving accounts to a file or database)
* Input validation (e.g., negative deposits, invalid CPF format)
* Support for multiple accounts simultaneously
* Graphical interface or web-based version

---

## ⚖️ License

This project is for educational purposes and personal learning.

```
