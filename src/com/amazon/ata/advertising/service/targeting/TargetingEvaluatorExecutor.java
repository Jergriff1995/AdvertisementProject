package com.amazon.ata.advertising.service.targeting;

import com.amazon.ata.advertising.service.model.RequestContext;
import com.amazon.ata.advertising.service.targeting.predicate.TargetingPredicate;
import com.amazon.ata.advertising.service.targeting.predicate.TargetingPredicateResult;

import java.util.concurrent.Callable;

public class TargetingEvaluatorExecutor implements Callable<Boolean> {
    private TargetingPredicate predicate;
    private RequestContext requestContext;

    public TargetingEvaluatorExecutor(TargetingPredicate predicate, RequestContext requestContext) {
        this.predicate = predicate;
        this.requestContext = requestContext;
    }

    @Override
    public Boolean call() throws Exception {
        TargetingPredicateResult predicateResult = predicate.evaluate(requestContext);
        return predicateResult.isTrue();
    }
}
