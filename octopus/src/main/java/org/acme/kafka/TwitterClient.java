package org.acme.kafka;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.acme.domain.TwitterSentiment;
import org.acme.domain.Aggregation;
import io.smallrye.reactive.messaging.annotations.Broadcast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A bean consuming data from the "prices" Kafka topic and applying some conversion.
 * The result is pushed to the "my-data-stream" stream which is an in-memory stream.
 */
@ApplicationScoped
public class TwitterClient {

    private static final double CONVERSION_RATE = 0.88;
    public static final Logger log = LoggerFactory.getLogger(TwitterClient.class);	



    //@Incoming("hashtag-counts")
    //@Outgoing("octopus-sentiments")
    //@Broadcast
    public String process(String post) {

        log.info("******** PROCESSING:" + post);
        TwitterSentiment sample = new TwitterSentiment("Mikes", 30, "happy","","");

        return post;
    }

}