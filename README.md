**Password Generator Project Report**

**1. Project Overview**
The Password Generator is a Java-based application designed to create secure and customizable passwords based on user-defined criteria. It enables users to specify password length, choose character types (lowercase, uppercase, numbers, symbols), and define custom character sets. The goal is to generate strong passwords that meet security standards.

**2. Design Choices**
- **Programming Language:** Java was chosen for its robustness, security features, and ease of handling user input and randomization.
- **Randomization:** The `SecureRandom` class was used instead of `Random` to ensure cryptographically strong password generation.
- **User Interaction:** A command-line interface (CLI) was implemented to allow flexible input from users.
- **Custom Character Sets:** Users can enter their own character sets if predefined options do not meet their needs.

**3. Challenges Encountered**
- **Ensuring Password Strength:** Implementing logic to ensure passwords meet minimum security criteria was essential.
- **Handling User Input:** Validating user choices and handling incorrect inputs required additional checks.
- **Character Pool Optimization:** Ensuring passwords contain a balanced mix of characters based on user preferences.

**4. Algorithms and Data Structures Used**
- **String Manipulation:** The password is built using a `StringBuilder` to improve performance when appending characters.
- **Random Selection:** A character pool string is dynamically generated based on user choices, and characters are randomly selected using `SecureRandom`.
- **Conditional Logic:** `if` statements determine which character types to include in the password.

**5. Improvements Made**
- **Custom Character Set Support:** Initially, only predefined sets were available. The ability to define a custom set was added to enhance flexibility.
- **Input Validation:** Additional checks were added to prevent invalid inputs, such as empty character pools.
- **User Guidance:** Error messages and prompts were improved to make the CLI experience more user-friendly.

**6. File Usage**
No external files were used for input or output in this implementation. All interactions occur via the command line, making it lightweight and easy to use without additional dependencies. However, future enhancements could include saving passwords to a file or integrating with a password manager.

**7. Additional Explanations**
- The `SecureRandom` class provides strong random number generation to enhance security.
- A dynamic character pool allows users to create passwords tailored to their specific needs.
- The program ensures usability by allowing users to define length and character types dynamically while maintaining security standards.

**Conclusion**
This project successfully provides a customizable and secure password generation tool. Future enhancements could include a GUI version, integration with password storage solutions, and additional security features like entropy calculations.

**Step 1:**
![image](https://github.com/user-attachments/assets/18e0d7d2-22f1-4970-bbca-3b9fc0afb6fb)
**Step 2:**
![image](https://github.com/user-attachments/assets/9edc2a70-d627-4b02-828c-130f80f21ffc)
**Step 3:**
![image](https://github.com/user-attachments/assets/bb52117b-7409-4fe4-bc37-80967ea40d9f)
**Step 4:**
![image](https://github.com/user-attachments/assets/7636ad80-c36f-4cd3-b17e-9678f864f730)
**Step 5:**
![image](https://github.com/user-attachments/assets/f275de1a-9bfe-4ac9-ad23-48d5dbe53cab)
**Step 6-7:**
![image](https://github.com/user-attachments/assets/986f6d30-65f9-48b2-a38a-2e7ebd7cabfc)


**The Project made by Beksultan Akmatbek uulu, from the group COMCEH24.**
