# 🛡️ Shelter Locator

**Shelter Locator** is a Java desktop application that helps you find the **nearest shelter to donate to** from your current location. You can also use it to find the **shortest route to a shelter of your choice** on a custom-drawn map.

The application was created to **test my implementation of Dijkstra's algorithm**, and uses **JavaFX** for a user-friendly graphical interface.

---

## 🚀 Features

- 🗺️ Custom-drawn interactive map using JavaFX  
- 📍 Select your location and find the **nearest shelter**  
- ➡️ Choose a destination shelter and find the **shortest path** to it  
- 💡 Uses **Dijkstra’s algorithm** for efficient pathfinding  
- 🧭 Visual representation of the computed path on the map  

---

## 🛠️ Technologies Used

- Java  
- JavaFX  
- Dijkstra’s Algorithm

---

## 📦 How to Run the Program

You can either compile the source code or simply use the **pre-built JAR file** provided.

### ✅ Requirements
- Java installed on your system  
- JavaFX SDK downloaded and extracted on your machine  

### ▶️ Running with the JAR File

1. Download and install the [JavaFX SDK](https://openjfx.io/).
2. Locate the `lib` folder of the JavaFX SDK (e.g., `C:\javafx-sdk-20\lib`).
3. Open the `run.bat` batch file included in the source code.
4. Edit the batch file and update the following:
   - Path to your **JavaFX module** folder (`--module-path`)
   - Path to your **Shelter Locator JAR file**
5. Save and double-click `run.bat` to start the program.

Example batch file:
```bat
java --module-path "C:\path\to\javafx-sdk-XX\lib" --add-modules javafx.controls,javafx.fxml -jar "C:\path\to\shelter-locator.jar"
