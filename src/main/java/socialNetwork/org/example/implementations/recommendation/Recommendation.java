package socialNetwork.org.example.implementations.recommendation;

import socialNetwork.org.example.abstracts.AbstractRecommendation;

import java.util.List;

public class Recommendation extends AbstractRecommendation {
    private final List<String> recommendations;

    public Recommendation(List<String> recommendations) {
        this.recommendations = recommendations;
    }

    @Override
    public List<String> getRecommendationList() {
        return recommendations;
    }
}