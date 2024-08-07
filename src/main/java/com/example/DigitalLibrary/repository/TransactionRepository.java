package com.example.DigitalLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DigitalLibrary.model.Book;
import com.example.DigitalLibrary.model.Student;
import com.example.DigitalLibrary.model.Transaction;
import com.example.DigitalLibrary.model.enums.TransactionStatus;
import com.example.DigitalLibrary.model.enums.TransactionType;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {


    Transaction findTopByStudentAndBookAndTransactionTypeAndTransactionStatusOrderByTransactionTimeDesc(
            Student student, Book book, TransactionType transactionType, TransactionStatus transactionStatus
    );
}
