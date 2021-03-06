package br.com.jbugbrasil.database;

import java.sql.Connection;

/**
 * @author <a href="mailto:spoltin@hrstatus.com.br">Filippe Spolti</a>
 */
public interface DatabaseOperations {

    /*
    * Returns the database connection
    */
    Connection getConnection();

    /*
    * Close the connection
    */
    void closeConnection();

    /*
    * Create the KARMA table if it does not exist
    */
    void createTableKarma();

    /*
    * Query the karma points of the given username
    * @param String username
    */
    int getKarmaPoints(String username);

    /*
    * Create the AMOUNTOFBOOKS table if it does not exist
    */
    void createTableAmountOfBooks();

    /*
    * Create the BOOKUPDATES table if it does not exist
    */
    void createTableBookUpdate();

    /*
    * Update the amount of the books value
    * @param int amount
    */
    void setAmountOfBooks(int amount);

    /*
    * Update the amount of the books value
    * @param int amount
    */
    void setBookUpdate(String bookName, int updates);

    /*
    * Query the amount of books
    * @returns an integer
    */
    int getAmoutOfBooks();

    /*
    * Query the amount of books
    * @returns an integer
    */
    int getBookUpdates(String bookName);
}