# serhii.yegorov.encoder

Консольний застосунок для шифрування та розшифрування файлів шифром Цезаря з можливістю автоматичного підбору ключа
console application for encrypting and decrypting files with the Caesar cipher with the possibility of automatic key selection
Обробка аргументів з командного рядка та взаємодія з файловою системою
Processing of arguments from the command line and interaction with the file system

## Приклад використання
java -jar c:/MyProject/target/myApp.jar ENCRYPT folder/textFile1.txt 20 // Файл з результатом folder/textFile1[ENCRYPTED].txt
java -jar c:/MyProject/target/myApp.jar DECRYPT folder/textFile1[ENCRYPTED].txt 20 // Файл з результатом folder/textFile1[DECRYPTED].txt
