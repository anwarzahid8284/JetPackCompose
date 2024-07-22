# Toolbar with Jetpack Compose

This project demonstrates how to create a custom toolbar using Jetpack Compose in Android. The toolbar includes various UI elements such as an ImageView, title, and action icons, showcasing the flexibility and power of Jetpack Compose for modern Android development.

## Features

- Customizable toolbar with Jetpack Compose
- Integration of ImageView in the toolbar
- Easy to adapt and extend for various use cases
- Clean and concise code structure

## Screenshots

<div style="display: flex; justify-content: space-around;">
    <img src="https://github.com/anwarzahid8284/JetPackCompose/assets/66475556/81a991ff-0873-4c95-80df-3f3b93c1263f" alt="toolbar" style="width: 45%;">
    <img src="https://github.com/anwarzahid8284/JetPackCompose/assets/66475556/d2500b02-19c9-46a1-805f-3afd96572769" alt="login screen" style="width: 45%;">
</div>

## Recycler view in Jetpack compose

https://github.com/user-attachments/assets/a463015d-e379-486c-842e-aa32fb2a3d12

## Getting Started

To get started with this project, you can clone the repository using the following link: [JetPackCompose GitHub Repository](https://github.com/anwarzahid8284/JetPackCompose.git "JetPackCompose Repository")

## Key Components of the Toolbar

Here's an example of how you can create a custom toolbar using Jetpack Compose:

```kotlin
@Composable
fun CustomToolbar(
    title: String,
    onNavigationIconClick: () -> Unit,
    actions: @Composable RowScope.() -> Unit = {}
) {
    TopAppBar(
        title
