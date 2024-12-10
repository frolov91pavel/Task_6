package socialNetwork.org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import socialNetwork.org.example.abstracts.AbstractRecommendation;
import socialNetwork.org.example.implementations.recommendation.RecommendationServiceImpl;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RecommendationServiceImplTest {
    private RecommendationServiceImpl recommendationService;

    @BeforeEach
    void setUp() {
        recommendationService = new RecommendationServiceImpl();
    }

    @Test
    void testGetRecommendations() {
        AbstractRecommendation recommendations = recommendationService.getRecommendations("1");
        assertTrue(recommendations.getRecommendationList().contains("Friend 1"));
    }
}