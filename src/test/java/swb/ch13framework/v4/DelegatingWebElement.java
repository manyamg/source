package swb.ch13framework.v4;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;

public class DelegatingWebElement extends DelegatingSearchContext<WebElement> //<1>
    implements WebElement, Locatable, WrapsElement {

    public DelegatingWebElement(WebElement delegate) {
      super(delegate);                   //<2>
    }

    @Override
    public void click() {
        delegate.click();      //<3>
    }

    @Override
    public void submit() {
        delegate.submit();
    }

    @Override
    public void sendKeys(CharSequence... keysToSend) {
        delegate.sendKeys(keysToSend);
    }

    @Override
    public void clear() {
        delegate.clear();
    }

    @Override
    public String getTagName() {
        return delegate.getTagName();
    }

    @Override
    public String getAttribute(String name) {
        return delegate.getAttribute(name);
    }

    @Override
    public boolean isSelected() {
        return delegate.isSelected();
    }

    @Override
    public boolean isEnabled() {
        return delegate.isEnabled();
    }

    @Override
    public String getText() {
        return delegate.getText();
    }

    @Override
    public boolean isDisplayed() {
        return delegate.isDisplayed();
    }

    public String getValue() {
        return delegate.getAttribute("value");
    }

    @Override
    public Point getLocation() {
        return delegate.getLocation();
    }

    @Override
    public Dimension getSize() {
        return delegate.getSize();
    }

    @Override
    public String getCssValue(String propertyName) {
        return delegate.getCssValue(propertyName);
    }

    @Override
    public Rectangle getRect() {
        return delegate.getRect();
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return delegate.getScreenshotAs(outputType);
    }

    @Override
    public Coordinates getCoordinates() {
        return ((Locatable)delegate).getCoordinates();
    }

    @Override
    public WebElement getWrappedElement() {
        return ((WrapsElement)delegate).getWrappedElement();
    }
}
