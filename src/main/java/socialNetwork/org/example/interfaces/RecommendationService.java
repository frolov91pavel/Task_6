package socialNetwork.org.example.interfaces;

import socialNetwork.org.example.abstracts.AbstractRecommendation;

public interface RecommendationService {
    AbstractRecommendation getRecommendations(String userId);
}