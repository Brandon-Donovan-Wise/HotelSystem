/**
 * ReviewService.java
 * Service interface for the Review
 * Author: Shanlynn Courtney Thomas (218053762)
 * Date: 10 June 2023
 */
package za.ac.cput.service;

import za.ac.cput.domain.Review;

import java.util.List;

public interface ReviewService {
    Review create(Review review);
    Review read(String id);
    boolean delete(String id);
    List<Review>getAll();
}