/**
 * The MIT License (MIT)
 * 
 * Copyright (c) 2015 Tyler Bucher
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package redmanencryption;

import java.io.File;
import java.util.Map;

/**
 * This class is designed to be extended by derivative
 * works of the Redman Encryption Standard.
 * @author Tyler Bucher
 */
public abstract class BaseEncryption {
    
    /**
     * Creates a key message for the transfer
     * of a key.
     * @return The encrypted message
     */
    public abstract String createKey();
    
    /**
     * Initializes this encryption instance.
     * @param key - the key to be set
     */
    public abstract void initializeEncryption(String key);
    
    /**
     * Encrypts a message and outputs the encrypted message. 
     * @param message - The message to be encrypted
     * @return The encrypted message
     */
    public abstract String encrypt(String message);
    
    /**
     * Decrypts the encrypted message and outputs the original message.
     * @param message - The encrypted message to be decrypted
     * @return The original message
     */
    public abstract String decrypt(String message);
    
    /**
     * Returns the name of this derivative.
     * @return The name of this derivative
     */
    public abstract String getName();
    
    /**
     * Returns the current encryption key as a hash-map.
     * @return The key as a hash-map
     */
    public abstract Map<String, String> toKey();
    
    /**
     * Loads a key from a file.
     * @param key - The key to be loaded
     */
    public abstract void loadKey(File key);
}