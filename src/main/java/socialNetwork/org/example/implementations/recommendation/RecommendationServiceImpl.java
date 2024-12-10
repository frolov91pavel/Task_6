package socialNetwork.org.example.implementations.recommendation;

import socialNetwork.org.example.abstracts.AbstractRecommendation;
import socialNetwork.org.example.interfaces.RecommendationService;

import java.util.Arrays;

public class RecommendationServiceImpl implements RecommendationService {
    @Override
    public AbstractRecommendation getRecommendations(String userId) {
        return new Recommendation(Arrays.asList("Friend 1", "Friend 2"));
    }
}