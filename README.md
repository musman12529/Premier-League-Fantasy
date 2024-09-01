# Football Match Prediction

This repository contains a machine learning model to predict the outcome of football matches using a Random Forest classifier. The dataset is processed to include features like venue, opponent, and rolling averages of game statistics to enhance prediction accuracy.
## Overview

The goal of this project is to predict the outcomes of football matches based on historical match data. The model predicts whether a team will win, lose, or draw a match based on various features extracted from the dataset.

## Data Preparation

1. **Import Data**: The match data is read from `matches.csv`.
2. **Data Cleaning**: Columns such as `comp` and `notes` are removed. The `date` column is converted to a datetime format.
3. **Target Variable**: A binary target variable `target` is created, indicating whether a team won (`1`) or did not win (`0`).
4. **Feature Encoding**: Categorical features like `venue` and `opponent` are converted into numerical codes.

## Feature Engineering

- **Rolling Averages**: Rolling averages for various match statistics (e.g., goals scored, goals against, shots) are calculated to capture recent performance trends.
- **Datetime Features**: Additional features like `hour` of the match and `day_code` (day of the week) are extracted from the `date`.

## Model Training and Prediction

A Random Forest classifier is used to train the model:

- **Training and Test Split**: The data is split into training and test sets based on the date (training set: matches before 2022-01-01, test set: matches after 2022-01-01).
- **Model Training**: The model is trained using the training set and a set of predictors, including both the original and the rolling average features.
- **Prediction and Evaluation**: The model's performance is evaluated using precision and accuracy metrics.

## Results

- **Accuracy**: The initial model achieved an accuracy of 61.23%.
- **Precision**: After incorporating rolling averages, the precision improved to 67%.



# Premier League Stats Scraper

A web scraping tool to collect team statistics from the Premier League and compile them into a CSV file.

## Features

- Scrapes team statistics from the FBRef Premier League website.
- Extracts and compiles data into a single CSV file.

## Requirements

- Python 3.x
- Libraries: `beautifulsoup4`, `pandas`, `requests`, `lxml`
