package com.myorg;

import org.jetbrains.annotations.Nullable;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.events.targets.SnsTopic;
import software.amazon.awscdk.services.sns.Topic;
import software.amazon.awscdk.services.sns.subscriptions.EmailSubscription;
import software.constructs.Construct;

public class SnsStack extends Stack {

    private final SnsTopic snsTopic;

    public SnsStack(@Nullable Construct scope, @Nullable String id) {
        this(scope, id, null);
    }

    public SnsStack(@Nullable Construct scope, @Nullable String id, @Nullable StackProps props) {
        super(scope, id, props);
        Topic topic = Topic.Builder.create(this, "ProdutoEventsTopis").topicName("product-event").build();
        snsTopic = SnsTopic.Builder.create(topic).build();

        snsTopic.getTopic().addSubscription(EmailSubscription.Builder.create("alcirbarros@hotmail.com.br").json(true).build());
    }

    public SnsTopic getSnsTopic() {
        return snsTopic;
    }
}
