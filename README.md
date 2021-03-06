# Handwritten-Digit-Dataset
[![CodeFactor](https://www.codefactor.io/repository/github/jc-progjava/handwritten-digit-dataset/badge)](https://www.codefactor.io/repository/github/jc-progjava/handwritten-digit-dataset)

A collection of 107,730 28x28 PNG files of digits from 0-9 for use in machine learning.

**Note:** these images are not from MNIST and are original. They were created with various data augmentation techniques, which were performed on the digits.

The dataset can be found [here](https://github.com/JC-ProgJava/Handwritten-Digit-Dataset/releases), and is updated there. You can download it [here](https://www.kaggle.com/jcprogjava/handwritten-digits-dataset-not-in-mnist) as well. The dataset consists of 10 folders, one for each digit, and the digits are named '\<digit>\\\<file-number>.png', where \<digit> is the digit it depicts, and \<file-number>, a number ranging from 0 to `the total number of files in the folder - 1`.


## Creating your own dataset

You can create your own dataset [here](https://jc-progjava.github.io/Handwritten-Digit-Dataset/), do note that it takes a while for the data to download (~10-15 minutes for 29160 files, I find focusing on the tab makes the progress faster).

Steps:
1. Draw the digit using the canvas box at the center of the screen using your mouse.
2. Click on the button with the corresponding digit to which you drew.
   You can click on the 'clear' button to clear the canvas, or refresh the page to remove unsatisfactory data (e.g., the image is cut off at the bottom).
3. When you have finished drawing all digits from 0-9 **once** (more won't work), click 'done', and wait for your data to download and save.


## License

The **dataset and code** is licensed under the [CC BY-SA 4.0](https://creativecommons.org/licenses/by-sa/4.0/) license, which gives permission for:
- Sharing: distributing & copying the dataset in any format.
- Adaptation/modification: change, add ons.
- Commercial use

As long as:
- Attribution: credit is given to the creator, providing a link to the license and page where the dataset was originally found.
- Changes to the dataset are specified.
- Your version of this dataset is distributed under the same license.

A more rigorous version can be found [here](LICENSE.md).
