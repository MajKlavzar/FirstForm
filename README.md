
# FirstForm – Registration Form

The **FirstForm** application is a mobile application developed in Java using Android Studio as part of the **Mobile Application Development** course.

## 📌 Project Description

The application contains a registration form for collecting basic user information. The form is designed to adapt to different screen sizes using the `ScrollView` component. When the user clicks the submit button, the entered data is retrieved and displayed in a multiline dialog box (`AlertDialog`).

## 🚀 Features

### User Interface (`activity_main.xml`)

- **Title:** Registration Form
- **Input fields (`EditText`):**
  - Username
  - Full Name
  - Country
  - Email
  - Phone Number
  - Password (with masked characters and an appropriate `hint`)
- **Gender selection (`RadioGroup` and `RadioButton`):**
  - Male
  - Female
  - Both options are arranged horizontally in a single row.
- **Checkbox (`CheckBox`):**
  - Agree with Terms & Conditions
- **Submit button (`Button`):**
  - Create account
  - The button is horizontally centered and set to 50% of the screen width.
- **Responsive layout:** The `ScrollView` component ensures that all content remains accessible on smaller screens.

### Application Logic (`MainActivity.java`)

When the user clicks the **Create account** button, the application:

1. Retrieves the values from all input fields.
2. Identifies the selected gender (`Male`, `Female`, or `Not specified`).
3. Checks the state of the checkbox.
4. Prepares a multiline summary of the entered information.
5. Displays a dialog box titled **Registration Details** using the `AlertDialog.Builder` class.
6. Displays the terms and conditions acceptance status:
   - `Terms Accepted: Yes`
   - `Terms Accepted: No`

## 🛠️ Technologies Used

- **Programming language:** Java
- **Development environment:** Android Studio
- **Build system:** Gradle
- **User interface:** Android XML
- **UI components:** `ConstraintLayout`, `ScrollView`, `LinearLayout`, `EditText`, `RadioGroup`, `RadioButton`, `CheckBox`, and `Button`
- **Dialog box:** `AlertDialog.Builder`

## 💻 How to Run the Application

1. Open the `FirstForm` project folder in Android Studio.
2. Wait for the Gradle project synchronization (Gradle Sync) to complete.
3. Start an Android emulator or connect a physical Android device.
4. Click **Run 'app'** or use the keyboard shortcut `Shift + F10`.
5. Wait for the application to install and launch.
6. Fill in all the registration form fields.
7. Select a gender and optionally accept the terms and conditions.
8. Click the **Create account** button.
9. Review the summary of the entered information in the **Registration Details** dialog box.
