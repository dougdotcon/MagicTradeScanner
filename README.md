# MagicTradeScanner

MagicTradeScanner is an Android application designed to streamline the trading and valuation process for Magic: The Gathering players. By leveraging Optical Character Recognition (OCR), the app allows users to scan physical cards with their device camera to instantly retrieve current market prices from TCGPlayer, eliminating the need for manual data entry.

## Key Features

- **OCR Card Scanning**: Automatically identifies card names from the camera feed.
- **Real-time Price Fetching**: Retrieves minimum, average, and maximum prices from TCGPlayer.
- **Trade Management**: Visually organize cards into trade stacks with calculated totals.
- **Data Efficiency**: Downloads price data via Wi-Fi to minimize mobile data usage.
- **Player Utilities**:
  - Life Counter for gameplay.
  - Export collections to `.DEK` file format.
  - Manage Pucatrade binders.
  - Potential integration with TappedOut.

## Getting Started

### Prerequisites

- Android Studio (latest version recommended).
- Android SDK installed.
- An Android device or emulator for testing.

### Installation & Building

1. **Clone the Repository**: Since the previous Git history was removed, initialize a fresh repository.
    bash
    git init
    git remote add origin <your-new-repo-url>
    

2. **Open in Android Studio**:
    - Launch Android Studio.
    - Select "Open an Existing Project".
    - Navigate to the cloned directory and click "OK".

3. **Sync Dependencies**:
    - Android Studio will prompt to sync the Gradle project.
    - Ensure the `gson-2.2.4.jar` library is present in `app/libs/`.

4. **Configure API & Sensitive Data**:
    - **Important**: Do not commit API keys or sensitive configurations directly to the codebase.
    - It is recommended to use `local.properties` or secure environment variable injection methods.

5. **Run the Application**:
    - Connect your Android device via USB (with Developer Options enabled) or start an Emulator.
    - Click the "Run" (Green Play) button in Android Studio.

## Project Structure

- **Camera & OCR**: Handles image capture and text recognition logic.
- **API Client**: Connects to TCGPlayer to fetch card pricing.
- **UI/UX**: Manages the visual organization of trade piles and settings.
- **Tools**: Contains logic for the Life Counter and File Export features.

## Contributing

1. Fork the repository.
2. Create a new feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a Pull Request.

## License

Distributed under the MIT License. See `LICENSE` for more information.
