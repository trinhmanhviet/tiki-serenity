Feature: Search tiki

  Scenario: Searching for apple
    Given user is on tiki home page
    When he searches for "apple"
    Then he tick on tiki now
    And he choose the fifth item
    And he verify the product
    And he add 2 product to cart
    And he check the cart for the item and price