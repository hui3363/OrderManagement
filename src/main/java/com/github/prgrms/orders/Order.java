package com.github.prgrms.orders;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;

import static com.google.common.base.Preconditions.checkArgument;
import static java.time.LocalDateTime.now;
import static java.util.Optional.ofNullable;
import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;
import static org.apache.commons.lang3.StringUtils.isEmpty;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

public class Order {
    /*
    
      "seq": 7,
      "productId": 3,
      "review": null,
      "state": "REQUESTED",
      "requestMessage": null,
      "rejectMessage": null,
      "completedAt": null,
      "rejectedAt": null,
      "createAt": "2021-01-20 20:13:36"
      */
    private Long seq;
    private Long productId;
    //Review review;
    private String state;
    private String requestMessage;
    private String rejectMessage;
    private LocalDateTime completedAt;
    private LocalDateTime rejectedAt;
    private LocalDateTime createAt;

  public Order(Long seq, Long productId) {
    this(seq, productId, null, null, null, null, null, null);
  }

  public Order(Long seq, Long productId, String state, String requestMessage, String rejectMessage, LocalDateTime completedAt, LocalDateTime rejectedAt, LocalDateTime createAt) {
    /*checkArgument(isNotEmpty(name), "name must be provided");
    checkArgument(
      name.length() >= 1 && name.length() <= 50,
      "name length must be between 1 and 50 characters"
    );
    checkArgument(
      isEmpty(details) || details.length() <= 1000,
      "details length must be less than 1000 characters"
    );*/

    this.seq = seq;
    this.productId = productId;
    this.requestMessage = requestMessage;
    this.rejectMessage = rejectMessage;
    this.completedAt = defaultIfNull(completedAt, now());
    this.rejectedAt = defaultIfNull(rejectedAt, now());
    this.createAt = defaultIfNull(createAt, now());
  }


  public Long getSeq() {
    return seq;
  }

  public String getState() {
    return state;
  }


  public Long getProdectId() {
    return productId;
  }

  public Optional<String> getRequestMessage() {
    return ofNullable(requestMessage);
  }

  public Optional<String> getRejectMessage() {
    return ofNullable(rejectMessage);
  }

  public LocalDateTime getCompletedAt() {
    return completedAt;
  }

  public LocalDateTime getRejectedAt() {
    return rejectedAt;
  }

  public LocalDateTime getCreateAt() {
    return createAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Order order = (Order) o;
    return Objects.equals(seq, order.seq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seq);
  }

  @Override
  public String toString() {
      // TODO Auto-generated method stub
      return super.toString();
  }
/*
  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
      .append("seq", seq)
      .append("name", name)
      .append("details", details)
      .append("reviewCount", reviewCount)
      .append("createAt", createAt)
      .toString();
  }

  static public class Builder {
    private Long seq;
    private String name;
    private String details;
    private int reviewCount;
    private LocalDateTime createAt;

    public Builder() {}

    public Builder(Product product) {
      this.seq = product.seq;
      this.name = product.name;
      this.details = product.details;
      this.reviewCount = product.reviewCount;
      this.createAt = product.createAt;
    }

    public Builder seq(Long seq) {
      this.seq = seq;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder details(String details) {
      this.details = details;
      return this;
    }

    public Builder reviewCount(int reviewCount) {
      this.reviewCount = reviewCount;
      return this;
    }

    public Builder createAt(LocalDateTime createAt) {
      this.createAt = createAt;
      return this;
    }

    public Product build() {
      return new Product(
        seq,
        name,
        details,
        reviewCount,
        createAt
      );
    }
  }
*/
}